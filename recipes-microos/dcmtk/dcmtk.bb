SUMMARY = "DICOM Toolkit"
DESCRIPTION = "DCMTK is a collection of libraries and applications implementing large \
parts the DICOM standard."
LICENSE = "BSD-3-Clause & Apache-2.0"

PV = "3.6.7"

RPM_NAME = "dcmtk-3.6.7-1.9.aarch64.rpm"
RPM_HASH = "df134546703ec10daeafb7e06dfafa5395b8a8ccd3777fa762efba21f4bc5d721e2d71d04409cd9e0b7c455ec7d1842dba4fad9505ccb6a5d5134142dfb8da69"

RPROVIDES:${PN} += "config(dcmtk) dcmtk dcmtk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcmr.so.17()(64bit) libdcmdata.so.17()(64bit) libdcmdsig.so.17()(64bit) libdcmect.so.17()(64bit) libdcmfg.so.17()(64bit) libdcmimage.so.17()(64bit) libdcmimgle.so.17()(64bit) libdcmiod.so.17()(64bit) libdcmjpeg.so.17()(64bit) libdcmjpls.so.17()(64bit) libdcmnet.so.17()(64bit) libdcmpstat.so.17()(64bit) libdcmqrdb.so.17()(64bit) libdcmrt.so.17()(64bit) libdcmseg.so.17()(64bit) libdcmsr.so.17()(64bit) libdcmtls.so.17()(64bit) libdcmwlm.so.17()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libi2d.so.17()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) liboflog.so.17()(64bit) libofstd.so.17()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libz.so.1()(64bit)"

inherit rpm
