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

RPM_NAME = "razor-agents-2.86-1.6.aarch64.rpm"
RPM_HASH = "c4641f4f2ac09ddd94a924af51da0faaff4f9388c3d3d21f0bfec5585f807709e8e866932ba4464e5185c5083d320e690e865745df05b3304b176dbdb17ac63c"

RPROVIDES:${PN} += "razor-agents"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-razor-agents"

inherit rpm
