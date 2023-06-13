SUMMARY = "Python library for Windows Remote Management"
DESCRIPTION = "pywinrm is a Python client for Windows Remote Management (WinRM). This \
allows you to invoke commands on target Windows machines from any \
machine that can run Python. \
 \
WinRM allows you to call native objects in Windows. This includes, but \
is not limited to, running batch scripts, powershell scripts and \
fetching WMI variables. For more information on WinRM, please visit \
Microsoft's WinRM http://msdn.microsoft.com/en-us/library/aa384426.aspx"
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python39-pywinrm-0.4.3-2.1.noarch.rpm"
RPM_HASH = "091bc06c5946c46990fcb1aa82750047026f778f590bf07206aa382524a3054af4f9f44220c416d1aa8cb2dad8cdf0b9363fc22c4d9326bd558d461986d519a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pywinrm) \
python39-pywinrm \
python3dist(pywinrm)"

RDEPENDS:${PN} += "python(abi) \
python39-requests \
python39-requests_ntlm \
python39-six \
python39-xmltodict"

inherit rpm
