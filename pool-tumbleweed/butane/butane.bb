SUMMARY = "Tool to generate Ignition configs from Butane Configs"
DESCRIPTION = "Butane translates human-readable Butane Configs into machine-readable \
Ignition configs for provisioning operating systems that use Ignition."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "butane-0.17.0-1.4.aarch64.rpm"
RPM_HASH = "0b45240ebbc249fef3fefdb34306faf6906f685a9ac6ec7d40fc8ca1a8ef6522d5e39ddc728c63e01ed779f91f0e68570deea69cfe5ded6a2cf63da7dc7711f7"

RPROVIDES:${PN} += "butane \
ignition-config-transpiler"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
