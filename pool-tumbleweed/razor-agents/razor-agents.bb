SUMMARY = "SPAM catalogue inquiry and update tool"
DESCRIPTION = "Vipul's Razor is a distributed, collaborative, spam detection and \
filtering network. Razor establishes a distributed and constantly \
updating catalogue of spam in propagation. This catalogue is used by \
clients to filter out known spam. On receiving a spam, a Razor \
Reporting Agent (run by an end-user or a troll box) calculates and \
submits a 20-character unique identification of the spam (a SHA Digest) \
to its closest Razor Catalogue Server. The Catalogue Server echos this \
signature to other trusted servers after storing it in its database. \
Prior to manual processing or transport-level reception, Razor \
Filtering Agents (end-users and MTAs) check their incoming mail against \
a Catalogue Server and filter out or deny transport in case of a \
signature match. Catalogued spam, once identified and reported by a \
Reporting Agent, can be blocked out by the rest of the Filtering Agents \
on the network. \
 \
Can be used as one of the spamassassin rules."
LICENSE = "Artistic-2.0"

PV = "2.86"

RPM_NAME = "razor-agents-2.86-1.5.aarch64.rpm"
RPM_HASH = "afc45edadb1fff6c53ba1a0e9a5cdca1795447f85fd2bd619790d7cc577eed16bee67df64d72be3cfa8e359ef0553539f635e5c1f50254fdaac763004eb98d38"

RPROVIDES:${PN} += "razor-agents"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-razor-agents"

inherit rpm
