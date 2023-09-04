SUMMARY = "SELinux"
DESCRIPTION = "Security-Enhanced Linux (SELinux) provides a mechanism for supporting access control security policies, including mandatory access controls (MAC). \
Its architecture strives to separate enforcement of security decisions from the security policy, and streamlines the amount of software involved with security policy enforcement."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-selinux-20200505-42.1.aarch64.rpm"
RPM_HASH = "bfe916cf0c74e7232adf71744de43dc549aef119ff2a83513de414656a477d219c6b89ff17b59aded7360f88df84d8630e43d5db725476c49349c89fb1461c04"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-selinux"

RDEPENDS:${PN} += "pattern- \
policycoreutils \
selinux-autorelabel \
selinux-policy \
selinux-tools"

inherit rpm
