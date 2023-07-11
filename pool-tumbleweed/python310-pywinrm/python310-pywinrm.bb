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

RPM_NAME = "python310-pywinrm-0.4.3-2.3.noarch.rpm"
RPM_HASH = "c10dc0720c6ac6aa8eac3c09f21a3aec6b7bb340ee22191b06505288af492e6e289938b4bc07934743162f97f52f5f0b3085a240d4f54ccbcff776a580a291b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pywinrm \
python310-pywinrm \
python3dist-pywinrm"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-requests-ntlm \
python310-six \
python310-xmltodict"

inherit rpm
