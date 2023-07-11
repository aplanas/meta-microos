SUMMARY = "Replacement for Make"
DESCRIPTION = "SCons is a make replacement that provides a range of enhanced features, \
such as automated dependency generation and built-in compilation cache \
support. SCons rule sets are Python scripts, which means that SCons \
provides itself as well as the features. SCons allows you to use the \
full power of Python to control compilation."
LICENSE = "MIT"

PV = "4.5.2"

RPM_NAME = "scons-4.5.2-1.2.noarch.rpm"
RPM_HASH = "0aafdff33af9ac40cef64a0afa4510fa8074eaa81f099e51abc471a50571c21247b1fdca0057e013a10b1015b5af70aad01ee1cb87e4bb9060039e06dc2f5c52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-scons \
python3dist-scons \
scons"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
