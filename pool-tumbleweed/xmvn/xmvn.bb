SUMMARY = "Local Extensions for Apache Maven"
DESCRIPTION = "This package provides extensions for Apache Maven that can be used to \
manage system artifact repository and use it to resolve Maven \
artifacts in offline mode, as well as Maven plugins to help with \
creating RPM packages containing Maven artifacts."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-4.2.0-4.1.aarch64.rpm"
RPM_HASH = "6cf06e1cba7c52f4336361db9ae587f04f81c91b76827ceb2f4657d461f45d8b614aa9c7ac5ceb0a147df4509dda852bf8d28b7b0452239bad59d091fcb0475f"

RPROVIDES:${PN} += "xmvn"

RDEPENDS:${PN} += "xmvn-minimal"

inherit rpm
