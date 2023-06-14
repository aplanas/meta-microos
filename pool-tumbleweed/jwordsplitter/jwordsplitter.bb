SUMMARY = "A Java library to split German compound words"
DESCRIPTION = "This Java library can split German compound words into smaller parts. \
This is especially useful for German words but it can work with all languages, \
as long as a dictionary and a class extending AbstractWordSplitter is provided. \
So far, only German is supported and a German dictionary is included in the JAR. \
Even though it will work for some adjectives it works best for nouns."
LICENSE = "Apache-2.0"

PV = "4.4"

RPM_NAME = "jwordsplitter-4.4-1.18.noarch.rpm"
RPM_HASH = "6b87b4d678f8c86bbadeed429d5c7842e86adbd3e59427494e5424b56322dd12f6a960de42eb51ecebcebb9ae6e5b0c545de43621752ca28dd6efc710c021332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jwordsplitter \
mvn-de.danielnaber-jwordsplitter \
mvn-de.danielnaber-jwordsplitter-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
