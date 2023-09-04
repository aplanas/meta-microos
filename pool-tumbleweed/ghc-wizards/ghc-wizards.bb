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

RPM_NAME = "ghc-wizards-1.0.3-6.5.aarch64.rpm"
RPM_HASH = "643491697907b79c78fc1fa148f680465cd2c30370effee5b6094dd89ee14e04f5f88770b93ea68446b72a21c4ee68ee7f400afb8b339203e57d45dc9940fda2"

RPROVIDES:${PN} += "ghc-wizards \
libHSwizards-1.0.3-4dF6xVc0i30CRerGIMRP2J-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScontrol-monad-free-0.6.2-14mRW5Z3hOW3y0QtFAGsp6-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShaskeline-0.8.2-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHSterminfo-0.4.1.5-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
