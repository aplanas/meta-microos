SUMMARY = "SELinux"
DESCRIPTION = "Security-Enhanced Linux (SELinux) provides a mechanism for supporting access control security policies, including mandatory access controls (MAC). \
Its architecture strives to separate enforcement of security decisions from the security policy, and streamlines the amount of software involved with security policy enforcement."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-selinux-20200505-41.1.aarch64.rpm"
RPM_HASH = "173fd072739c9ca963bf0781f8fb7abb0f002b57c5973b954989f9e207d22e3462c343c3f1461e66cb68d2c90b0e4740dc7cff57bfe7ee01a09fcce5b64f1541"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-base-selinux \
patterns-base-selinux(aarch-64)"
RDEPENDS:${PN} += "pattern() \
policycoreutils \
selinux-autorelabel \
selinux-policy \
selinux-tools"

inherit rpm
