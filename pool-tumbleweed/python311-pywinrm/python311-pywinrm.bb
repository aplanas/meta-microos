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

RPM_NAME = "python311-pywinrm-0.4.3-2.3.noarch.rpm"
RPM_HASH = "ad35fcb21a0bdbf5a959fe7f76206e6ecc4bfdb105e9f9afa4769fc49be22375be59bc4645cea852e4d3c53520ea27caaa5385fa9b91b1374fdf3124e71e657d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pywinrm \
python3.11dist-pywinrm \
python311-pywinrm \
python3dist-pywinrm"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-requests-ntlm \
python311-six \
python311-xmltodict"

inherit rpm
