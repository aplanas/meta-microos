SUMMARY = "Fence Agent for  Intel AMT (WS)"
DESCRIPTION = "Fence agents are device drivers able to prevent computers from \
destroying data on shared storage. Their aim is to isolate a \
corrupted computer by controlling power, network or storage \
configuration. This packages provides an agent for Intel AMT (WS)."
LICENSE = "Apache-2.0"

PV = "4.12.1+git.1690196437.64f62dbb"

RPM_NAME = "fence-agents-amt_ws-4.12.1+git.1690196437.64f62dbb-1.1.aarch64.rpm"
RPM_HASH = "2645dbd77fe56caf35e2fa3516b98d3eb5d208c28c04d36fc0514b15735c3344d05db3a0d6b4aabdd080ed0998dc5f968b99feda95a3e65ece14a5fec2d23a93"

RPROVIDES:${PN} += "fence-agents-amt-ws"

RDEPENDS:${PN} += "/usr/bin/python3 \
fence-agents"

inherit rpm
