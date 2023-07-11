SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libitm1-gcc7-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "18ac6aa8392771704d0dd203ac329f014bac479a3ef0c55a3995df0f3622e1d5045661be3f0963977ae74515087176612c67ce67ee03e9551872bf59eee3d9b2"

RPROVIDES:${PN} += "libitm.so.1 \
libitm1 \
libitm1-gcc7"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
