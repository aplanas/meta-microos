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

RPM_NAME = "python310-pywinrm-0.4.3-2.1.noarch.rpm"
RPM_HASH = "19963c158c00faedc0d0d5d8eaad368cafee223611d65e589c8792be514357a65541d341fd0b2392f32bfc636e5c1033e22eda364b855e6d02a919858afb076e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pywinrm \
python3.10dist(pywinrm) \
python310-pywinrm \
python3dist(pywinrm)"
RDEPENDS:${PN} += "python(abi) \
python310-requests \
python310-requests_ntlm \
python310-six \
python310-xmltodict"

inherit rpm
