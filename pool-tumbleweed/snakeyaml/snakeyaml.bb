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

RPM_NAME = "snakeyaml-1.33-1.2.noarch.rpm"
RPM_HASH = "3f71025c77bea201a2eb5928ef99939eae37c50268cfd576ae3eb8214b3673d672870a28ab188ee49e40e4ca42cb20807aadb686c8b465487581a9596192169a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.yaml:snakeyaml) \
mvn(org.yaml:snakeyaml:pom:) \
osgi(org.yaml.snakeyaml) \
snakeyaml"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-codec:commons-codec)"

inherit rpm
