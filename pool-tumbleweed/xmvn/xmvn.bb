SUMMARY = "Local Extensions for Apache Maven"
DESCRIPTION = "This package provides extensions for Apache Maven that can be used to \
manage system artifact repository and use it to resolve Maven \
artifacts in offline mode, as well as Maven plugins to help with \
creating RPM packages containing Maven artifacts."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-4.2.0-2.1.aarch64.rpm"
RPM_HASH = "d0d60b8b452ec036d22997a40794dc5bc1522fdb8b64ea8de4eb5c4352c766bf1d7f90b1c9413107d531e06337c4ad60c41936cf34ac7cab11792ee7bda174c2"

RPROVIDES:${PN} += "xmvn"

RDEPENDS:${PN} += "xmvn-minimal"

inherit rpm
