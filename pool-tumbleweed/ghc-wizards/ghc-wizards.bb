SUMMARY = "High level, generic library for interrogative user interfaces"
DESCRIPTION = "'wizards' is a package designed for the quick and painless development of \
/interrogative/ programs, which revolve around a 'dialogue' with the user, who \
is asked a series of questions in a sequence much like an installation wizard. \
 \
Everything from interactive system scripts, to installation wizards, to \
full-blown shells can be implemented with the support of 'wizards'. \
 \
It is developed transparently on top of a free monad, which separates out the \
semantics of the program from any particular interface. A variety of backends \
exist, including console-based 'System.Console.Wizard.Haskeline' and \
'System.Console.Wizard.BasicIO', and the pure 'System.Console.Wizard.Pure'. \
It is also possible to write your own backends, or extend existing back-ends \
with new features. While both built-in IO backends operate on a console, there \
is no reason why 'wizards' cannot also be used for making GUI wizard \
interfaces. \
 \
See the github page for examples on usage: \
 \
<http://www.github.com/liamoc/wizards> \
 \
For creating backends, the module 'System.Console.Wizard.Internal' has a brief \
tutorial."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "ghc-wizards-1.0.3-5.3.aarch64.rpm"
RPM_HASH = "358e3f6912df0d8c46651b3c38ad8d4387880bd6359fc66ca66e97b97bdaa9f656e7b407ea166ae52a1c9712cf2ddd7aab6703bcdaf1dcc90d427b03b14d6f65"

RPROVIDES:${PN} += "ghc-wizards \
ghc-wizards(aarch-64) \
libHSwizards-1.0.3-1eOj2T9eMm8Jj6cnosVGZb-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHScontrol-monad-free-0.6.2-AMlHq80A2qJLNQ8iIcl5z7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSexceptions-0.10.5-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShaskeline-0.8.2-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprocess-1.6.16.0-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHSterminfo-0.4.1.5-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
