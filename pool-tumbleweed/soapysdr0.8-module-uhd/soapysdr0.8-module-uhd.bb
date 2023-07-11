SUMMARY = "Soapy SDR plugins for UHD supported SDR devices"
DESCRIPTION = "Soapy UHD - Soapy SDR devices for UHD. \
A UHD module that supports Soapy devices within the UHD API."
LICENSE = "GPL-3.0-only"

PV = "0.4.1"

RPM_NAME = "soapysdr0.8-module-uhd-0.4.1-2.14.aarch64.rpm"
RPM_HASH = "2089af5095c8567c90770d95c3671d2b74a92a5f90847e7cccc3d04f95da5ef7a1cc122ad2dc29a2b48b455b4341565067c154bc16dd239ce37502aa1e792fc7"

RPROVIDES:${PN} += "libsoapySupport.so \
libuhdSupport.so \
soapy-uhd-module \
soapysdr0.8-module-uhd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libuhd.so.4.4.0"

inherit rpm
