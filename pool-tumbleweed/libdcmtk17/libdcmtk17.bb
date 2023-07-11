SUMMARY = "DICOM Toolkit"
DESCRIPTION = "DCMTK is a collection of libraries and applications implementing large \
parts the DICOM standard."
LICENSE = "BSD-3-Clause & Apache-2.0"

PV = "3.6.7"

RPM_NAME = "libdcmtk17-3.6.7-2.3.aarch64.rpm"
RPM_HASH = "c80e728bce8143eac831c2bab97d86dc2bd698b61c9cada0aea522f2d365ecce7ea87e2705a5186bf4bdbd9beb9a84bd8c3bcdd73bc1fc0dafd06cf446d3b6f4"

RPROVIDES:${PN} += "libcmr.so.17 \
libdcmdata.so.17 \
libdcmdsig.so.17 \
libdcmect.so.17 \
libdcmfg.so.17 \
libdcmimage.so.17 \
libdcmimgle.so.17 \
libdcmiod.so.17 \
libdcmjpeg.so.17 \
libdcmjpls.so.17 \
libdcmnet.so.17 \
libdcmpmap.so.17 \
libdcmpstat.so.17 \
libdcmqrdb.so.17 \
libdcmrt.so.17 \
libdcmseg.so.17 \
libdcmsr.so.17 \
libdcmtk17 \
libdcmtk3-6 \
libdcmtkcharls.so.17 \
libdcmtls.so.17 \
libdcmtract.so.17 \
libdcmwlm.so.17 \
libi2d.so.17 \
libijg12.so.17 \
libijg16.so.17 \
libijg8.so.17 \
liboflog.so.17 \
libofstd.so.17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libicuuc.so.73 \
libm.so.6 \
libpng16.so.16 \
libssl.so.3 \
libstdc++.so.6 \
libtiff.so.6 \
libwrap.so.0 \
libxml2.so.2 \
libz.so.1"

inherit rpm
