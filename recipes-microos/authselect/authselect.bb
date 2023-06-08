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

RPM_NAME = "authselect-1.4.0+git.0.2c30265-3.2.aarch64.rpm"
RPM_HASH = "1c51ffd7ac8183f1407ffa34347395442c31b453f24fa6929d70705986464f7a76d1f9785bed34eedd59fda30f44889ea4d0d5d23daadc5c62efe1c09c3168f2"

RPROVIDES:${PN} += "authselect authselect(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libauthselect.so.3()(64bit) libauthselect.so.3(AUTHSELECT_1.0.1)(64bit) libauthselect.so.3(AUTHSELECT_1.0.2)(64bit) libauthselect.so.3(AUTHSELECT_1.0.3)(64bit) libauthselect.so.3(AUTHSELECT_1.1.0)(64bit) libauthselect.so.3(AUTHSELECT_1.2.3)(64bit) libauthselect3(aarch-64) libc.so.6(GLIBC_2.34)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit)"

inherit rpm
