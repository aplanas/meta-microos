SUMMARY = "JSON framework for C#"
DESCRIPTION = "Newtonsoft.Json aka Json.NET is a JSON framework."
LICENSE = "MIT & BSD-3-Clause"

PV = "7.0.1"

RPM_NAME = "newtonsoft-json-7.0.1-3.19.noarch.rpm"
RPM_HASH = "66acc47a95d541c6a47dd59850f9981a813723c7aff40ef81cf80ce830b789918f1a14836dc250588d3a350ecc1834dab4dfd5b6fabfafaeaddf724e56c77988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono(Newtonsoft.Json) \
newtonsoft-json"
RDEPENDS:${PN} += "mono(System) \
mono(System.Core) \
mono(System.Data) \
mono(System.Numerics) \
mono(System.Runtime.Serialization) \
mono(System.Xml) \
mono(System.Xml.Linq) \
mono(mscorlib)"

inherit rpm
