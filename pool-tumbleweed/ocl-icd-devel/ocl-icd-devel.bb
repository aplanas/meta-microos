SUMMARY = "Development files of ocl-icd"
DESCRIPTION = "This package provides the files needed to build OpenCL client drivers that \
use ocl-icd for ICD functionality."
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "ocl-icd-devel-2.3.1-2.1.aarch64.rpm"
RPM_HASH = "6856cb5ebe943e7f0cdf025a42405f0cae3361a3dab9111ca3537d7aeb28f3b19b5517f4a50a5d28979ad82167ca4c6f6ce4dd6783c78b8ffc23f6757090be84"

RPROVIDES:${PN} += "ocl-icd-devel \
ocl-icd-devel(aarch-64) \
pkgconfig(OpenCL) \
pkgconfig(ocl-icd)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOpenCL1 \
opencl-headers \
pkgconfig(egl)"

inherit rpm
