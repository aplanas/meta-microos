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

RPM_NAME = "python39-pywinrm-0.4.3-2.3.noarch.rpm"
RPM_HASH = "1a94087af6c584552a7f34fd4e9c34176822dc0af23ff4e3700183202c6673e8b6ef27b94e843144075f4ed97e8c224fa8c55e1763a4c8cc5a58b090ca45ef30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pywinrm \
python39-pywinrm \
python3dist-pywinrm"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-requests-ntlm \
python39-six \
python39-xmltodict"

inherit rpm
