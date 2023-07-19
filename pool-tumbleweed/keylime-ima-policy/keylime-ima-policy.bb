SUMMARY = "IMA policy for Keylime agent"
DESCRIPTION = "Subpackage of rust-keylime to provide an suggested IMA policy for Keylime agent"
LICENSE = "Apache-2.0 & MIT"

PV = "0.2.2+git.1689256829.3d2b627"

RPM_NAME = "keylime-ima-policy-0.2.2+git.1689256829.3d2b627-1.1.aarch64.rpm"
RPM_HASH = "5e9ef2b2bffac7827a7561ae1f46a21a7159148fe3d0341bd67bb3297120178e3aee85501a9110fa7c239ab9428015b7832de9594f9c568a70d54038f0ba9966"

RPROVIDES:${PN} += "config-keylime-ima-policy \
keylime-ima-policy"

RDEPENDS:${PN} += ""

inherit rpm
