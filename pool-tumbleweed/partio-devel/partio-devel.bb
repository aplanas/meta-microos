SUMMARY = "Development files for partio"
DESCRIPTION = "The partio-devel package contains libraries and header files for \
developing applications that use partio."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "partio-devel-1.14.6-1.9.aarch64.rpm"
RPM_HASH = "4f8522302210ae2eb9da58ea9fcd876daf76c7ae2b8bc9dbe251ee7a401d5b7617046c16fa2c3c92c3623e94cfcdf7b3a7673c3e22eab7906f69167a50f9e258"

RPROVIDES:${PN} += "partio-devel \
partio-devel(aarch-64)"
RDEPENDS:${PN} += "libpartio1"

inherit rpm
