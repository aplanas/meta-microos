SUMMARY = "Tool to generate Ignition configs from Butane Configs"
DESCRIPTION = "Butane translates human-readable Butane Configs into machine-readable \
Ignition configs for provisioning operating systems that use Ignition."
LICENSE = "Apache-2.0"

PV = "0.18.0"

RPM_NAME = "butane-0.18.0-1.1.aarch64.rpm"
RPM_HASH = "8654a6cf4c7bd9dce68c8f74963dcec9d7147d765458259e6adcb4d407d2ad94ee94fba504719b3361eb3c0f08760b41451f1fab0ba2599604f8881e12287286"

RPROVIDES:${PN} += "butane \
ignition-config-transpiler"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
