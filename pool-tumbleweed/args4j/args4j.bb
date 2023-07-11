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

RPM_NAME = "args4j-2.33-2.7.noarch.rpm"
RPM_HASH = "bd3be25e448fe6fc77d6a94c39c376d38fb71ecaa81595166ade5d767d1a22fa86454aa81772f7369ec727dd0b88f0e4965341f9fe30bbacf9f9741cac82ca64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "args4j \
mvn-args4j-args4j \
mvn-args4j-args4j-pom- \
osgi-org.kohsuke.args4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
