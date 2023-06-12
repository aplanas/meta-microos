SUMMARY = "A dictionary using both attribute and item syntax"
DESCRIPTION = "Addict is a module that exposes a dictionary subclass that allows \
items to be set like attributes. Values are gettable and settable \
using both attribute and item syntax."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python310-addict-2.4.0-1.8.noarch.rpm"
RPM_HASH = "82d2b43cb25918b3e744cea45d91e46790364f32744a4a75ffb77dd2d0e8f11d820ea310a76fbe19f58e152d8b9d675ca38eb12480b8b6a89603c616375e3914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-addict \
python3.10dist(addict) \
python310-addict \
python3dist(addict)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
