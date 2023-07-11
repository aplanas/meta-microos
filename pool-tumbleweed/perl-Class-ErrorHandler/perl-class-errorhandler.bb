SUMMARY = "Base class for error handling"
DESCRIPTION = "_Class::ErrorHandler_ provides an error-handling mechanism that's generic \
enough to be used as the base class for a variety of OO classes. Subclasses \
inherit its two error-handling methods, _error_ and _errstr_, to \
communicate error messages back to the calling program. \
 \
On failure (for whatever reason), a subclass should call _error_ and return \
to the caller; _error_ itself sets the error message internally, then \
returns 'undef'. This has the effect of the method that failed returning \
'undef' to the caller. The caller should check for errors by checking for a \
return value of 'undef', and calling _errstr_ to get the value of the error \
message on an error. \
 \
As demonstrated in the the SYNOPSIS manpage, _error_ and _errstr_ work as \
both class methods and object methods."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Class-ErrorHandler-0.04-1.16.noarch.rpm"
RPM_HASH = "a60a06a5216fd15ef0b5e27500d8f72e76236821ef276f24c3c770820414f68334de571255786612f2779cde153e293377fb8314b4dc414d25b4fade939ff57b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--ErrorHandler \
perl-Class-ErrorHandler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
