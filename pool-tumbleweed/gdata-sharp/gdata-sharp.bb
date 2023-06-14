SUMMARY = "Google Data APIs (GData) for Mono/.NET"
DESCRIPTION = "The GData .NET Client Library provides a library and source code \
that make it easy to access data through Google Data APIs."
LICENSE = "Apache-2.0"

PV = "1.4.0.2"

RPM_NAME = "gdata-sharp-1.4.0.2-26.14.noarch.rpm"
RPM_HASH = "958ae201d986d1707b550d4312b6d1efd393adb5662181414823747ff41f5b75c9d79272c5c27ae89e423de77ffdbe3d1abf7d3d288e749bcd173683d51d2879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdata-sharp \
google-gdata \
mono-Google.GData.AccessControl \
mono-Google.GData.Apps \
mono-Google.GData.Blogger \
mono-Google.GData.Calendar \
mono-Google.GData.Client \
mono-Google.GData.CodeSearch \
mono-Google.GData.Contacts \
mono-Google.GData.Documents \
mono-Google.GData.Extensions \
mono-Google.GData.GoogleBase \
mono-Google.GData.Health \
mono-Google.GData.Photos \
mono-Google.GData.Spreadsheets \
mono-Google.GData.YouTube"

RDEPENDS:${PN} += "mono-System \
mono-System.Web \
mono-System.Xml \
mono-mscorlib"

inherit rpm
