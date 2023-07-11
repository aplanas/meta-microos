SUMMARY = "database of robots.txt-derived permissions"
DESCRIPTION = "This module parses _/robots.txt_ files as specified in 'A Standard for \
Robot Exclusion', at <http://www.robotstxt.org/wc/norobots.html> Webmasters \
can use the _/robots.txt_ file to forbid conforming robots from accessing \
parts of their web site. \
 \
The parsed files are kept in a WWW::RobotRules object, and this object \
provides methods to check if access to a given URL is prohibited. The same \
WWW::RobotRules object can be used for one or more parsed _/robots.txt_ \
files on any number of hosts. \
 \
The following methods are provided: \
 \
* $rules = WWW::RobotRules->new($robot_name) \
 \
  This is the constructor for WWW::RobotRules objects. The first argument \
  given to new() is the name of the robot. \
 \
* $rules->parse($robot_txt_url, $content, $fresh_until) \
 \
  The parse() method takes as arguments the URL that was used to retrieve \
  the _/robots.txt_ file, and the contents of the file. \
 \
* $rules->allowed($uri) \
 \
  Returns TRUE if this robot is allowed to retrieve this URL. \
 \
* $rules->agent([$name]) \
 \
  Get/set the agent name. NOTE: Changing the agent name will clear the \
  robots.txt rules and expire times out of the cache."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "6.02"

RPM_NAME = "perl-WWW-RobotRules-6.02-9.27.noarch.rpm"
RPM_HASH = "2ca61e8fdec6c952a8094c2fef4e80a1ad04392d71661c63772201c294b9af37bebc7f8b99cb489e6c5d069915bb15e42a40d9b8fd863b3c0704900310b42b4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-WWW--RobotRules \
perl-WWW--RobotRules--AnyDBM-File \
perl-WWW--RobotRules--InCore \
perl-WWW-RobotRules"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-URI"

inherit rpm
