SUMMARY = "Adaptive Entropy Coding library"
DESCRIPTION = "Libaec provides lossless compression of signed or unsigned integers \
(samples) of sizes 1 to 32 bits wide. The library achieves best \
results for low entropy data as often encountered in space imaging \
instrument data or numerical model output from weather or climate \
simulations. While floating point representations are not directly \
supported, they can also be efficiently coded by grouping exponents \
and mantissa. \
 \
Libaec implements Golomb Rice coding as defined in the Space Data \
System Standard documents 121.0-B-3 and 120.0-G-2."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "libaec0-1.0.6-1.8.aarch64.rpm"
RPM_HASH = "647af8adeaafb61fdf40f9828f214f36c394a25f275af9cc9d549d45f21f74bb95eceeea681c5808b4f4aa1a800ec42af696576643a95d849d65e19c82c0bb6e"

RPROVIDES:${PN} += "libaec.so.0 \
libaec0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
