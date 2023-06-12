SUMMARY = "Lightweight Ruby"
DESCRIPTION = "mruby is the lightweight implementation of the Ruby language complying to (part \
of) the ISO standard. \
 \
mruby can be linked and embedded within your application. \
 \
We provide the interpreter program 'mruby' and the interactive mruby shell \
'mirb' as examples. \
 \
You can also compile Ruby programs into compiled byte code using the mruby \
compiler 'mrbc'. \
 \
The 'mrbc' is also able to generate compiled byte code in a C source file."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "mruby-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "dbdefd4a9621f32b6e19632120d8d93681066cb7a03b8e508d5b34943d76585952204723ee31b25ebbd702d50db6c8d46e0e749ff52b19b0dd9e8dca127bdc3a"

RPROVIDES:${PN} += "mruby \
mruby(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libmruby.so.3.1.0()(64bit) \
libmruby_core.so.3.1.0()(64bit)"

inherit rpm
