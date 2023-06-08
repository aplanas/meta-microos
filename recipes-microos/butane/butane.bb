SUMMARY = "Tool to generate Ignition configs from Butane Configs"
DESCRIPTION = "Butane translates human-readable Butane Configs into machine-readable \
Ignition configs for provisioning operating systems that use Ignition."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "butane-0.17.0-1.3.aarch64.rpm"
RPM_HASH = "48e6c7987cb16bca115a12caa2a6485fa83284d38adab5769810fa7b61cd3dd589da320bf429e44b13bcc11d6fede7cab312befb19cd3ff6ec786e7dcdee1716"

RPROVIDES:${PN} += "butane butane(aarch-64) ignition-config-transpiler ignition-config-transpiler(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
