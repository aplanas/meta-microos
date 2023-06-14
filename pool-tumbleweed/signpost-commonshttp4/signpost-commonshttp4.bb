SUMMARY = "Signpost Apache HttpClient Supports"
DESCRIPTION = "Signpost Apache HttpClient Supports."
LICENSE = "Apache-2.0"

PV = "1.2.1.2"

RPM_NAME = "signpost-commonshttp4-1.2.1.2-3.10.noarch.rpm"
RPM_HASH = "c55e6f82f4287b8baf75afd94af03b27ac6c58fb78293ff8bb6e49debf7312f4994c6febbdffe47b715c5d80e83995277fcf201c9da8b86e7d213ae82c0435eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-oauth.signpost-signpost-commonshttp4 \
mvn-oauth.signpost-signpost-commonshttp4-pom- \
signpost-commonshttp4"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-oauth.signpost-signpost-core \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpcore"

inherit rpm
