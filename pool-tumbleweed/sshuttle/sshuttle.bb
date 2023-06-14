SUMMARY = "VPN over an SSH tunnel"
DESCRIPTION = "Transparent proxy server that works as a poor man's VPN. Forwards over ssh. \
Doesn't require admin. Supports DNS tunneling. \
sshuttle is a program that solves the following case: \
- You have access to a remote network via ssh. \
- You don't necessarily have admin access on the remote network. \
- The remote network has no VPN, or only complex VPN \
  protocols (IPsec, PPTP, etc). \
- You don't want to create an SSH port forward for every \
  single host/port on the remote network. \
- You can't use openssh's PermitTunnel feature because \
  it's disabled by default on openssh servers; plus it does \
  TCP-over-TCP, which has terrible performance."
LICENSE = "LGPL-2.1-only"

PV = "1.1.1"

RPM_NAME = "sshuttle-1.1.1-1.2.noarch.rpm"
RPM_HASH = "176adfd69442df92047e922877faaf0166e731e571a2f63a8d4be8a9ba4062d3d7b97b1aa5eef159c55c087b6eed7bec6c4aacd0d91ed7c411d58789d1aa8c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sshuttle \
python3dist-sshuttle \
sshuttle"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/touch \
fillup \
python-abi"

inherit rpm
