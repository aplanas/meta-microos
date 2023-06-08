SUMMARY = "Fence Agent for  Intel AMT (WS)"
DESCRIPTION = "Fence agents are device drivers able to prevent computers from \
destroying data on shared storage. Their aim is to isolate a \
corrupted computer by controlling power, network or storage \
configuration. This packages provides an agent for Intel AMT (WS)."
LICENSE = "Apache-2.0"

PV = "4.12.1+git.1682325255.86f77326"

RPM_NAME = "fence-agents-amt_ws-4.12.1+git.1682325255.86f77326-1.1.aarch64.rpm"
RPM_HASH = "0baa1d15e10c8f070636c78cc470dc3812b318997751cd100dc5e6000e62b77f977195e1b61aee1d2654a403f5de01c839cfc40005acadb7c509c27e708d9f87"

RPROVIDES:${PN} += "fence-agents-amt_ws fence-agents-amt_ws(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 fence-agents"

inherit rpm
