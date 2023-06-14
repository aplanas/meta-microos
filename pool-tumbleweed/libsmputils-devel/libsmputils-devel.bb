SUMMARY = "Development files for the SAS SMP Expander Control Library"
DESCRIPTION = "The smp_utils package contains utilities for the Serial Attached SCSI \
(SAS) Management Protocol (SMP). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsmputils."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.99"

RPM_NAME = "libsmputils-devel-0.99-2.9.aarch64.rpm"
RPM_HASH = "7fbe2fa7b5236d12085b19f64e43ee38d36fe44ac2bc13ae94239308c91f01586eb184af84e11195ec2c7a69224e0326d51655c4b7cfc019974457327dc3bb9f"

RPROVIDES:${PN} += "libsmputils-devel"

RDEPENDS:${PN} += "libsmputils1-1"

inherit rpm
