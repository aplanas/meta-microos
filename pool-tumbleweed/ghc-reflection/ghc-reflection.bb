SUMMARY = "Reifies arbitrary terms into types that can be reflected back into terms"
DESCRIPTION = "This package addresses the /configuration problem/ which is propagating \
configurations that are available at run-time, allowing multiple configurations \
to coexist without resorting to mutable global variables or \
'System.IO.Unsafe.unsafePerformIO'. \
 \
That package is an implementation of the ideas presented in the paper \
'Functional Pearl: Implicit Configurations' by Oleg Kiselyov and Chung-chieh \
Shan (<http://okmij.org/ftp/Haskell/tr-15-04.pdf original paper>). \
However, the API has been streamlined to improve performance. \
 \
There are a handful of tutorials on how to use this library: \
 \
* Austin Seipp's tutorial \
<https://www.schoolofhaskell.com/user/thoughtpolice/using-reflection Reflecting \
values to types and back> provides a summary of the approach taken by this \
library, along with more motivating examples. \
 \
* Arnaud Spiwack's tutorial \
<https://www.tweag.io/posts/2017-12-21-reflection-tutorial.html All about \
reflection> explains how to use this library."
LICENSE = "BSD-3-Clause"

PV = "2.1.7"

RPM_NAME = "ghc-reflection-2.1.7-1.2.aarch64.rpm"
RPM_HASH = "177d0cec44dae5fe6f45250d831163e79fb551ddbc502d63aac92afaeb6cc69e45b04174caefebe893db7065b0a9e31c2a8a316160bb3493c91f8f5b42d46c98"

RPROVIDES:${PN} += "ghc-reflection \
ghc-reflection(aarch-64) \
libHSreflection-2.1.7-KcOWE7PS1mHy6gA2edHvV-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
