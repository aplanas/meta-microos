SUMMARY = "Capitalize strings ('to WORK AS titles' becomes 'To Work as Titles')"
DESCRIPTION = "Text::Capitalize provides some routines for *title-like* formatting of \
strings. \
 \
The simple *capitalize* function just makes the inital character of each \
word uppercase, and forces the rest to lowercase. \
 \
The *capitalize_title* function applies English title case rules (discussed \
below) where only the 'important' words are supposed to be capitalized. \
There are also some customization features provided to allow the user to \
choose variant rules. \
 \
Comparing *capitalize* and *captialize_title*: \
 \
  Input:             'lost watches of splitsville' \
  capitalize:        'Lost Watches Of Splitsville' \
  capitalize_title:  'Lost Watches of Splitsville' \
 \
Some examples of formatting with *capitalize_title*: \
 \
  Input:             'KiLLiNG TiMe' \
  capitalize_title:  'Killing Time' \
 \
  Input:             'we have come to wound the autumnal city' \
  capitalize_title:  'We Have Come to Wound the Autumnal City' \
 \
  Input:             'ask for whom they ask for' \
  captialize_title:  'Ask for Whom They Ask For' \
 \
Text::Capitalize also provides some functions for special effects such as \
*scramble_case*, which typically would be used for this sort of \
transformation: \
 \
  Input:            'get whacky' \
  scramble_case:    'gET wHaCkY'  (or something similar)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.5"

RPM_NAME = "perl-Text-Capitalize-1.5-1.16.noarch.rpm"
RPM_HASH = "35a43e021b6e78e55d07fce4eaffa5e3a0a08075f1945d0db7a3f03414fd4797df990d3d7bdb825e9ab51cabc3a508eaa6d7b34c877b0fe6b71f6dde27d7f0c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Capitalize \
perl-Text-Capitalize"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
