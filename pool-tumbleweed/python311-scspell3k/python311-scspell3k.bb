SUMMARY = "A conservative interactive spell checker for source code"
DESCRIPTION = "Scspell is a spell checker for source code. This is an unofficial fork (of \
https://launchpad.net/scspell) that runs on both Python 2 and 3. \
 \
Scspell does not try to be particularly smart--rather, it does the simplest \
thing that can possibly work: \
 \
    1. All alphanumeric strings (strings of letters, numbers, and \
       underscores) are spell-checked tokens. \
    2. Each token is split into one or more subtokens. Underscores and digits \
       always divide tokens, and capital letters will begin new subtokens. In \
       other words, ``some_variable`` and ``someVariable`` will both generate \
       the subtoken list {``some``, ``variable``}. \
    3. All subtokens longer than three characters are matched against a set of \
       dictionaries, and a match failure prompts the user for action. When \
       matching against the included English dictionary, *prefix matching* is \
       employed; this choice permits the use of truncated words like ``dict`` \
       as valid subtokens. \
 \
When applied to code written in most popular programming languages while using \
typical naming conventions, this algorithm will usually catch many errors \
without an annoying false positive rate. \
 \
In an effort to catch more spelling errors, Scspell is able to check each \
file against a set of dictionary words selected *specifically for that file*. Up \
to three different sub-dictionaries may be searched for any given file: \
 \
    1. A natural language dictionary. (Scspell provides an American \
       English dictionary as the default.) \
    2. A programming language-specific dictionary, intended to contain \
       oddly-spelled keywords and APIs associated with that language. \
       (Scspell provides small default dictionaries for a number of popular \
       programming languages.) \
    3. A file-specific dictionary, intended to contain uncommon strings which \
       are not likely to be found in more than a handful of unique files."
LICENSE = "GPL-2.0-only"

PV = "2.2"

RPM_NAME = "python311-scspell3k-2.2-4.15.noarch.rpm"
RPM_HASH = "3972d340ac5d62c2e0ac61697ace7631ff770a41fa2106fff6a97f7789498ca039e194d6223168cab7d72d3b132d2697c027db343b32f78f87a99ece41442f89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scspell3k \
python3.11dist-scspell3k \
python311-scspell3k \
python3dist-scspell3k"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
