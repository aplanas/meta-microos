SUMMARY = "Maven project templating toolkit"
DESCRIPTION = "Archetype is a Maven project templating toolkit. An archetype is \
defined as an original pattern or model from which all other things of \
the same kind are made. The names fits as we are trying to provide a \
system that provides a consistent means of generating Maven \
projects. Archetype will help authors create Maven project templates \
for users, and provides users with the means to generate parameterized \
versions of those project templates. \
 \
Using archetypes provides a great way to enable developers quickly in \
a way consistent with best practices employed by your project or \
organization. Within the Maven project we use archetypes to try and \
get our users up and running as quickly as possible by providing a \
sample project that demonstrates many of the features of Maven while \
introducing new users to the best practices employed by Maven. In a \
matter of seconds a new user can have a working Maven project to use \
as a jumping board for investigating more of the features in Maven. We \
have also tried to make the Archetype mechanism additive and by that \
we mean allowing portions of a project to be captured in an archetype \
so that pieces or aspects of a project can be added to existing \
projects. A good example of this is the Maven site archetype. If, for \
example, you have used the quick start archetype to generate a working \
project you can then quickly create a site for that project by using \
the site archetype within that existing project. You can do anything \
like this with archetypes. \
 \
You may want to standardize J2EE development within your organization \
so you may want to provide archetypes for EJBs, or WARs, or for your \
web services. Once these archetypes are created and deployed in your \
organization's repository they are available for use by all developers \
within your organization."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-3.2.1-1.9.noarch.rpm"
RPM_HASH = "e977f6dcf2d0c6037cec1b704fd48dc31fc0d3ce73371019a3e26ec8e7860fd543f82f177b5fad8262eaecc699de1d9b5b8b2bcb3c73fa92d4cea69e72e5e149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype \
mvn-org.apache.maven.archetype-archetype-models-pom- \
mvn-org.apache.maven.archetype-maven-archetype-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-parent-pom- \
mvn-org.codehaus.plexus-plexus-component-metadata"

inherit rpm
