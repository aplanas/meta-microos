SUMMARY = "ALSA topology configurations"
DESCRIPTION = "This package contains the configuration files for ALSA topology support."
LICENSE = "BSD-3-Clause"

PV = "1.2.5.1"

RPM_NAME = "alsa-topology-conf-1.2.5.1-1.6.noarch.rpm"
RPM_HASH = "ed9a5193f777ca456b609d7bb10d818a1552f490e806cd0dac58768147522054d1e830d4fe5cec69375a3de70b82394665e6f620ee9a6a06146c410a7c0ba4b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alsa-topology-conf firmware(skl_hda_dsp_generic-tplg.bin)"
RDEPENDS:${PN} += ""

inherit rpm
