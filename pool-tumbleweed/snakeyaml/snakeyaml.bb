SUMMARY = "YAML parser and emitter for the Java programming language"
DESCRIPTION = "SnakeYAML features: \
    * a complete YAML 1.1 parser. In particular, \
      SnakeYAML can parse all examples from the specification. \
    * Unicode support including UTF-8/UTF-16 input/output. \
    * high-level API for serializing and deserializing \
      native Java objects. \
    * support for all types from the YAML types repository. \
    * relatively sensible error messages."
LICENSE = "Apache-2.0"

PV = "1.33"

RPM_NAME = "snakeyaml-1.33-1.3.noarch.rpm"
RPM_HASH = "8d5403c3049ae4caa6d9844a14180af6538a0d13cf271af4d0b8f7de308c4fd99f77f2072e215792cca0dc631f03e1691b9905d2583c1fb4c08723cc9f8864c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.yaml-snakeyaml \
mvn-org.yaml-snakeyaml-pom- \
osgi-org.yaml.snakeyaml \
snakeyaml"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-codec-commons-codec"

inherit rpm
