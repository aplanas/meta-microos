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

RPM_NAME = "python311-pywinrm-0.4.3-2.1.noarch.rpm"
RPM_HASH = "0a50be1a353475da3c0d0cbfa3aa41f48ab5a19e1f35b4a628fc9cf58a7ab3b2019fda8b8be379973b395744a355958d06b76e1add1ab543043b6df065cb6203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pywinrm) \
python311-pywinrm \
python3dist(pywinrm)"
RDEPENDS:${PN} += "python(abi) \
python311-requests \
python311-requests_ntlm \
python311-six \
python311-xmltodict"

inherit rpm
