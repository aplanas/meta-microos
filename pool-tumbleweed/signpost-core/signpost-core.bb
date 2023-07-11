SUMMARY = "A simple, light-weight, and modular OAuth client library for the Java platform"
DESCRIPTION = "Signpost is the easy and intuitive solution for signing HTTP messages on the \
Java platform in conformance with the OAuth Core 1.0a standard. \
Signpost follows a modular and flexible design, allowing you to combine it with \
different HTTP messaging layers"
LICENSE = "Apache-2.0"

PV = "1.2.1.2"

RPM_NAME = "signpost-core-1.2.1.2-3.11.noarch.rpm"
RPM_HASH = "7381af0df4c4af2d68f3b7a3b50b88dff1d0d88a20de3e49d4b4d2349bb1a94bacd68e4f7d56809eb46d75111bbb803919449c7c592e110e632cb73aaa8e1c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-oauth.signpost-signpost-core \
mvn-oauth.signpost-signpost-core-pom- \
signpost-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-codec-commons-codec"

inherit rpm
