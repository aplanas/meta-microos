SUMMARY = "DICOM Toolkit"
DESCRIPTION = "DCMTK is a collection of libraries and applications implementing large \
parts the DICOM standard."
LICENSE = "BSD-3-Clause & Apache-2.0"

PV = "3.6.7"

RPM_NAME = "dcmtk-3.6.7-2.3.aarch64.rpm"
RPM_HASH = "5f03f2a606e4a210b48b01179e49a2fc01224588ad412ceecdb6ac28d14b0aa7735aa81f225e8bab652e7929ee0a29d797724f9ebcb10b8108d9f680f506b809"

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
