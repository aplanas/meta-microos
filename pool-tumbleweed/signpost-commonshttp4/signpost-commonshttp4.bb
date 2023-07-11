SUMMARY = "Signpost Apache HttpClient Supports"
DESCRIPTION = "Signpost Apache HttpClient Supports."
LICENSE = "Apache-2.0"

PV = "1.2.1.2"

RPM_NAME = "signpost-commonshttp4-1.2.1.2-3.11.noarch.rpm"
RPM_HASH = "14c69e148f8936afc18264441076be8afe39e900ce61941a7764169be3461a37ca7fc7318d238631212b38e3d10253b198ce25b33889900b45acbc4451390721"
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
