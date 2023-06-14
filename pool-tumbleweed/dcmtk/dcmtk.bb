SUMMARY = "DICOM Toolkit"
DESCRIPTION = "DCMTK is a collection of libraries and applications implementing large \
parts the DICOM standard."
LICENSE = "BSD-3-Clause & Apache-2.0"

PV = "3.6.7"

RPM_NAME = "dcmtk-3.6.7-2.2.aarch64.rpm"
RPM_HASH = "b1150792b7836afc5901fa3b35483d6a3a19238f2b5b95468736dcee61e946f82269b06f56f394ca1b86b8c36d9106aa8132afd89534bb5619a4be359fdfdd1b"

RPROVIDES:${PN} += "config-dcmtk \
dcmtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcmr.so.17 \
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
libdcmpstat.so.17 \
libdcmqrdb.so.17 \
libdcmrt.so.17 \
libdcmseg.so.17 \
libdcmsr.so.17 \
libdcmtls.so.17 \
libdcmwlm.so.17 \
libgcc-s.so.1 \
libi2d.so.17 \
libm.so.6 \
liboflog.so.17 \
libofstd.so.17 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
