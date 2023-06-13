SUMMARY = "Lexically scoped subroutine wrappers"
DESCRIPTION = "Hook::LexWrap allows you to install a pre- or post-wrapper (or both) around \
an existing subroutine. Unlike other modules that provide this capacity \
(e.g. Hook::PreAndPost and Hook::WrapSub), Hook::LexWrap implements \
wrappers in such a way that the standard 'caller' function works correctly \
within the wrapped subroutine. \
 \
To install a prewrappers, you write: \
 \
        use Hook::LexWrap; \
 \
        wrap 'subroutine_name', pre => \\&some_other_sub; \
 \
    \
 \
The first argument to 'wrap' is a string containing the name of the \
subroutine to be wrapped (or the typeglob containing it, or a reference to \
it). The subroutine name may be qualified, and the subroutine must already \
be defined. The second argument indicates the type of wrapper being applied \
and must be either ''pre'' or ''post''. The third argument must be a \
reference to a subroutine that implements the wrapper. \
 \
To install a post-wrapper, you write: \
 \
        wrap 'subroutine_name', post => \\&yet_another_sub; \
 \
    \
 \
To install both at once: \
 \
        wrap 'subroutine_name', \
             pre  => \\&some_other_sub, \
             post => \\&yet_another_sub; \
 \
or: \
 \
        wrap *subroutine_name, \
             post => \\&yet_another_sub,  # order in which wrappers are \
             pre  => \\&some_other_sub;   # specified doesn't matter \
 \
Once they are installed, the pre- and post-wrappers will be called before \
and after the subroutine itself, and will be passed the same argument list. \
 \
The pre- and post-wrappers and the original subroutine also all see the \
same (correct!) values from 'caller' and 'wantarray'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.26"

RPM_NAME = "perl-Hook-LexWrap-0.26-1.23.noarch.rpm"
RPM_HASH = "dab73c09f11e5fcc57ee8353d8e40253d22c928cadc3a67dcafd62b8172edf29f8b428fce628b86f2da4e74347a6c1d148cb8e12865e7eb2e0614d7cc2f67f73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Hook::LexWrap) \
perl-Hook-LexWrap"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
