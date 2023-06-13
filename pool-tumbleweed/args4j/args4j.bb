SUMMARY = "Java command line arguments parser"
DESCRIPTION = "args4j is a small Java class library that makes it easy \
to parse command line options/arguments in your CUI application. \
- It makes the command line parsing very easy by using annotations \
- You can generate the usage screen very easily \
- You can generate HTML/XML that lists all options for your documentation \
- Fully supports localization \
- It is designed to parse javac like options (as opposed to GNU-style \
  where ls -lR is considered to have two options l and R)"
LICENSE = "MIT"

PV = "2.33"

RPM_NAME = "args4j-2.33-2.6.noarch.rpm"
RPM_HASH = "cff5515b53b19430139669d45bf8c3a9a5afb23a9545615ff85f5c2e514a3c3c9a6f23063d273737ce30035b447a993cc66ee43cbd1ed522864cf25a055623b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "args4j \
mvn(args4j:args4j) \
mvn(args4j:args4j:pom:) \
osgi(org.kohsuke.args4j)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
