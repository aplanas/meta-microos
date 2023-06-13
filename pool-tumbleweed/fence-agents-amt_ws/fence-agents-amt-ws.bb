SUMMARY = "Fence Agent for  Intel AMT (WS)"
DESCRIPTION = "Fence agents are device drivers able to prevent computers from \
destroying data on shared storage. Their aim is to isolate a \
corrupted computer by controlling power, network or storage \
configuration. This packages provides an agent for Intel AMT (WS)."
LICENSE = "Apache-2.0"

PV = "4.12.1+git.1682325255.86f77326"

RPM_NAME = "fence-agents-amt_ws-4.12.1+git.1682325255.86f77326-2.1.aarch64.rpm"
RPM_HASH = "1a659a5a5e2a38b58f5ee789f1a0fd1132c230c60ed1c2718a9879d3f6269583744ac69fc16cef6c7dd9bcaf4bcaf01a170678c6630d0a2fed8f7c098a5c5d23"

RPROVIDES:${PN} += "fence-agents-amt_ws \
fence-agents-amt_ws(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
fence-agents"

inherit rpm
