SUMMARY = "Configures authentication and identity sources from supported profiles"
DESCRIPTION = "Authselect is designed to be a replacement for authconfig but it takes \
a different approach to configure the system. Instead of letting \
the administrator build the PAM stack with a tool (which may potentially \
end up with a broken configuration), it would ship several tested stacks \
(profiles) that solve a use-case and are well tested and supported. \
At the same time, some obsolete features of authconfig are not \
supported by authselect."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0+git.0.2c30265"

RPM_NAME = "authselect-1.4.0+git.0.2c30265-3.3.aarch64.rpm"
RPM_HASH = "91f7960d01ba1a5dfe8a8d4e6711c12f5385d1f8f68497dcdf1621fac4706a3a1709e5274a91de3cb95eada641b5b04ff738e49271597450c719da34a3383b0e"

RPROVIDES:${PN} += "authselect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libauthselect.so.3 \
libauthselect3 \
libc.so.6 \
libpopt.so.0"

inherit rpm
