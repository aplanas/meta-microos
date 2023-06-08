SUMMARY = "Integration of uGet with Chrome"
DESCRIPTION = "Integration of the uGet Download Manager with Chrome."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "chrome-uget-integrator-1.0.0-2.10.aarch64.rpm"
RPM_HASH = "2f5b077f10f1a7aa80311f50eadb31097cb27eec3c65a47906406ccaed6e3fea7bc7cfa81d48f1b613a7886a0f5b53521ad6a3a9c176c6a6f8be9e580f89c300"

RPROVIDES:${PN} += "chrome-uget-integrator chrome-uget-integrator(aarch-64) config(chrome-uget-integrator)"
RDEPENDS:${PN} += "uget-integrator"

inherit rpm
